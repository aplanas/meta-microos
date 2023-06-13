SUMMARY = "Firefox browser forensic tool"
DESCRIPTION = "Extract all forensic interesting information from Firefox, \
Iceweasel and Seamonkey browsers. \
Works in command line interface, so information dumps could be \
redirected by pipes with tools such as grep, awk, cut, sed... \
Dumpzilla allows to visualize following sections, search \
customization and extract certain content. \
 \
Features: \
 * Cookies + DOM Storage (HTML 5). \
 * User preferences (Domain permissions, Proxy settings...). \
 * Downloads. \
 * Web forms (Searches, emails, comments..). \
 * Historial. \
 * Bookmarks. \
 * Cache HTML5 Visualization / Extraction (Offline cache). \
 * visited sites 'thumbnails' Visualization / Extraction . \
 * Addons / Extensions and used paths or urls. \
 * Browser saved passwords. \
 * SSL Certificates added as a exception. \
 * Session data (Webs, reference URLs and text used in forms). \
 * Visualize live user surfing, Url used in each tab or window \
   and use of forms."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.0+git.20210311"

RPM_NAME = "dumpzilla-0.0.0+git.20210311-1.2.noarch.rpm"
RPM_HASH = "657571437b1d0b9fb71b902ef7abc8eb16ffd8e1e71a070021107388cbd853eb1d0887ea8b7ada1383e5eec43b7cdbd4cd88e6f1dd7dee6b94f13137a7aace37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dumpzilla"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-lz4 \
python3-python-magic"

inherit rpm
