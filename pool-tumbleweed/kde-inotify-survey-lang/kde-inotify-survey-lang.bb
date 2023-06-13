SUMMARY = "Translations for package kde-inotify-survey"
DESCRIPTION = "Provides translations for the 'kde-inotify-survey' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kde-inotify-survey-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "1cdeba15800c66533b1a7e0b489255e814269d063cc1840eb064e407903dee6d34383cac30f84b0f35df05ebb4a803f526600e9730a8df7a473a42e80471200f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-inotify-survey-lang \
kde-inotify-survey-lang-all \
locale(kde-inotify-survey:ca) \
locale(kde-inotify-survey:ca@valencia) \
locale(kde-inotify-survey:cs) \
locale(kde-inotify-survey:de) \
locale(kde-inotify-survey:en_GB) \
locale(kde-inotify-survey:es) \
locale(kde-inotify-survey:eu) \
locale(kde-inotify-survey:fr) \
locale(kde-inotify-survey:gl) \
locale(kde-inotify-survey:it) \
locale(kde-inotify-survey:ja) \
locale(kde-inotify-survey:ka) \
locale(kde-inotify-survey:ko) \
locale(kde-inotify-survey:lt) \
locale(kde-inotify-survey:nl) \
locale(kde-inotify-survey:pl) \
locale(kde-inotify-survey:pt) \
locale(kde-inotify-survey:ru) \
locale(kde-inotify-survey:sk) \
locale(kde-inotify-survey:sl) \
locale(kde-inotify-survey:sv) \
locale(kde-inotify-survey:tr) \
locale(kde-inotify-survey:uk) \
locale(kde-inotify-survey:zh_CN) \
locale(kde-inotify-survey:zh_TW)"

RDEPENDS:${PN} += "kde-inotify-survey"

inherit rpm
