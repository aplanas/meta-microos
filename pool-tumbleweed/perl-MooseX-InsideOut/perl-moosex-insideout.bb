SUMMARY = "inside-out objects with Moose"
DESCRIPTION = "MooseX::InsideOut provides metaroles for inside-out objects. That is, it \
sets up attribute slot storage somewhere other than inside '$self'. This \
means that you can extend non-Moose classes, whose internals you either \
don't want to care about or aren't hash-based."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.106"

RPM_NAME = "perl-MooseX-InsideOut-0.106-9.26.noarch.rpm"
RPM_HASH = "e1f1fa62f34fd5a8008153e10bce66a85b26e7da2d002fbda0c9cd00d7afd247b149324d160cf279459d2d2a06b93278c01f7693f39b2e270f27bdd1c3f85101"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--InsideOut \
perl-MooseX--InsideOut--Role--Meta--Instance \
perl-MooseX-InsideOut"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--MOP \
perl-Hash--Util--FieldHash--Compat \
perl-Moose \
perl-namespace--clean"

inherit rpm
