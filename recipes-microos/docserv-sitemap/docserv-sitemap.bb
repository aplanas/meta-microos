SUMMARY = "Generate sitemap xml files for rpm2docserv"
DESCRIPTION = "This tool generates sitemap xml files from a rpm2docserv generated docserv directory for search engines."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-sitemap-20230308.4ed55cf-1.3.aarch64.rpm"
RPM_HASH = "c12f2be470396f0a5d2e309ca4e477aea86c259262f622c15fa61e8268ac2cf6ca1b281c225eeaafc92d11cf11bb9ec3aa94678a51c18a8e6fb252dfeb411bc9"

RPROVIDES:${PN} += "docserv-sitemap docserv-sitemap(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
