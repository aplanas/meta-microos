SUMMARY = "System() and background procs w/ piping, redirs, ptys (Unix, Win32)"
DESCRIPTION = "IPC::Run allows you to run and interact with child processes using files, \
pipes, and pseudo-ttys. Both system()-style and scripted usages are \
supported and may be mixed. Likewise, functional and OO API styles are both \
supported and may be mixed. \
 \
Various redirection operators reminiscent of those seen on common Unix and \
DOS command lines are provided."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "20220807.0"

RPM_NAME = "perl-IPC-Run-20220807.0-1.4.noarch.rpm"
RPM_HASH = "c98d7f6685026c0f25307652e478f95dfbee3609665a8ba812c9ef252b606f495020bba7bb2af39e9f1563809e1ee1affe40722376dfc7735200c2df7dd79009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-IPC--Run \
perl-IPC--Run--Debug \
perl-IPC--Run--IO \
perl-IPC--Run--Timer \
perl-IPC--Run--Win32Helper \
perl-IPC--Run--Win32IO \
perl-IPC--Run--Win32Process \
perl-IPC--Run--Win32Pump \
perl-IPC-Run"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-IO--Pty"

inherit rpm
