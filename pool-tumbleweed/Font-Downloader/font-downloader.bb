SUMMARY = "Install fonts from online sources"
DESCRIPTION = "Font-Downloader is an application allows you to search and install fonts \
directly from the Google Fonts website."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "Font-Downloader-10.0.0-1.2.noarch.rpm"
RPM_HASH = "d928cdb29b0ae42a81144ee42663fd099007945da11985a1e87e1bacaa61475f353585f45e9ab126ea4e70cb476043c9d0f0aaa42009c9a68ef0390e321de6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Font-Downloader \
application() \
application(org.gustavoperedo.FontDownloader.desktop) \
metainfo() \
metainfo(org.gustavoperedo.FontDownloader.appdata.xml)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gobject-Gdk"

inherit rpm
