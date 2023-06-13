SUMMARY = "Communicate with the I3 Window Manager"
DESCRIPTION = "communicate with the i3 window manager"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.17"

RPM_NAME = "perl-AnyEvent-I3-0.17-1.24.noarch.rpm"
RPM_HASH = "c0971f7562c0235308b92dd5ebe2bff287782b2559a06490294048a1a7268dfdfef320bd6f3148327465a6664a94c10c75bfe7c28c335ebd7f4df6318a2ac334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(AnyEvent::I3) \
perl-AnyEvent-I3"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(AnyEvent) \
perl(AnyEvent::Handle) \
perl(AnyEvent::Socket) \
perl(JSON::XS)"

inherit rpm
