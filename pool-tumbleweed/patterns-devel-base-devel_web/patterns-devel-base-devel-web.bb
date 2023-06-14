SUMMARY = "Web Development"
DESCRIPTION = "Tools and libraries for Web application development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_web-20170319-11.2.aarch64.rpm"
RPM_HASH = "5e5567d4a9a4ee97fb70d230e387efbb4c5daeee56e7de38dbbabf1545ada70464718e234f112f1d5f41c4759bd8ad9a3fabb8e579e9fa9e6c8e394402be63fd"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-web"

RDEPENDS:${PN} += "pattern-"

inherit rpm
