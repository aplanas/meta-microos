SUMMARY = "X Session Manager"
DESCRIPTION = "xsm is a session manager. A session is a group of applications, each \
of which has a particular state. xsm allows you to create arbitrary \
sessions - for example, you might have a 'light' session, a 'development' \
session, or an 'xterminal' session. Each session can have its own set of \
applications. Within a session, you can perform a 'checkpoint' to save \
application state, or a 'shutdown' to save state and exit the session. When \
you log back in to the system, you can load a specific session, and you can \
delete sessions you no longer want to keep."
LICENSE = "MIT"

PV = "1.0.5"

RPM_NAME = "xsm-1.0.5-1.6.aarch64.rpm"
RPM_HASH = "e78562f1c51c389e06d75624127b12e4eb5d808673a2caeab7f03fc118a2e92d852cb246ddc78cd574bad2c4acb88d5b5e07e0974369ef12ba99f1a6841e53db"

RPROVIDES:${PN} += "xsm \
xsm(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit) \
openssh"

inherit rpm
