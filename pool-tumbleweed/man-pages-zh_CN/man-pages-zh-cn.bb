SUMMARY = "Simplified Chinese Linux man pages"
DESCRIPTION = "Modern Linux man pages localization project for Chinese language. \
 \
It's based on manpages-zh project, a successor for CMPP linux man \
pages translation project (discontinued), and Linux CN linux man \
pages translation project, with some new addons from openSUSE \
maintainers."
LICENSE = "GFDL-1.3-or-later"

PV = "1.6.3.6"

RPM_NAME = "man-pages-zh_CN-1.6.3.6-1.6.noarch.rpm"
RPM_HASH = "243ca435624f1e7a945ead914476b469333808d8342d1c08d9c7a65b30a925e8b895bc4a9d678e5495797663d8a56ba70817e495ed32ce369e52842eb465cd00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man:zh) \
man-pages-zh_CN"

RDEPENDS:${PN} += ""

inherit rpm
