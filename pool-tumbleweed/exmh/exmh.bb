SUMMARY = "Front-End for nmh Written in tcl/tk"
DESCRIPTION = "Exmh is an X user interface for NMH mail. NMH provides a set of UNIX \
commands that manage folders and mail messages. NMH has many features \
as a result of several years of availability. Exmh provides a graphical \
interface to many of these features, but not everything."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "exmh-2.8.0-2.19.noarch.rpm"
RPM_HASH = "043de77366e911d55b276a15750abeddef58127f51cfbe3e631b9545c9dfb05de0e4b4e0a9817d025a244267579d7092b6df7ffa9f2ab87b6244bac4743cd027"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exmh"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/wish \
expect \
metamail \
nmh"

inherit rpm
