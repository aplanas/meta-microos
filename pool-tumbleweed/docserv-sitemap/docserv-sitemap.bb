SUMMARY = "Generate sitemap xml files for rpm2docserv"
DESCRIPTION = "This tool generates sitemap xml files from a rpm2docserv generated docserv directory for search engines."
LICENSE = "Apache-2.0"

PV = "20230308.4ed55cf"

RPM_NAME = "docserv-sitemap-20230308.4ed55cf-1.5.aarch64.rpm"
RPM_HASH = "a1bfc2bc1ed20367d4d5e01de2e9b1071e610ccc0efb2e362966a1bd677e9b96ca0e946b689b961057c1a27299134ec8b9ebd48f1a132b7e318f356852eff336"

RPROVIDES:${PN} += "docserv-sitemap"

RDEPENDS:${PN} += ""

inherit rpm
