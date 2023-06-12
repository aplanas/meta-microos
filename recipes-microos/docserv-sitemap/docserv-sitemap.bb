SUMMARY = "Generate sitemap xml files for rpm2docserv"
DESCRIPTION = "This tool generates sitemap xml files from a rpm2docserv generated docserv directory for search engines."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-sitemap-20230308.4ed55cf-1.4.aarch64.rpm"
RPM_HASH = "6c99af11abf3201f37bdcf95d44472daf825d521355542de68f1c6b0d491d78c3d54971aa3f3dcd642dad5ab325b6998f7a7f72bb4e395c9b151a220b99b2682"

RPROVIDES:${PN} += "docserv-sitemap docserv-sitemap(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
