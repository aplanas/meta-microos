SUMMARY = "inside-out objects with Moose"
DESCRIPTION = "MooseX::InsideOut provides metaroles for inside-out objects. That is, it \
sets up attribute slot storage somewhere other than inside '$self'. This \
means that you can extend non-Moose classes, whose internals you either \
don't want to care about or aren't hash-based."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.106"

RPM_NAME = "perl-MooseX-InsideOut-0.106-9.27.noarch.rpm"
RPM_HASH = "2afc20f584409392becc78725ae1bb9e73d268f736037ef48579dcd3f21bcd0121e839702b921bdac595e3a92e1ced7f320613d8db00c1cbff272e19b815456f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--InsideOut \
perl-MooseX--InsideOut--Role--Meta--Instance \
perl-MooseX-InsideOut"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--MOP \
perl-Hash--Util--FieldHash--Compat \
perl-Moose \
perl-namespace--clean"

inherit rpm
