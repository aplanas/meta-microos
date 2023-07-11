SUMMARY = "Translations for package kde-inotify-survey"
DESCRIPTION = "Provides translations for the 'kde-inotify-survey' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kde-inotify-survey-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "424ad2f400693a156470644dcf181fff85923a9b1ec6ef1da0a249fb153cf7eef8f69ab960ea45619884e0031c11049be1896d1c06996eed41b683b58bb9fa20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-inotify-survey-lang \
kde-inotify-survey-lang-all \
locale-kde-inotify-survey-ca \
locale-kde-inotify-survey-ca@valencia \
locale-kde-inotify-survey-cs \
locale-kde-inotify-survey-de \
locale-kde-inotify-survey-en-GB \
locale-kde-inotify-survey-es \
locale-kde-inotify-survey-eu \
locale-kde-inotify-survey-fi \
locale-kde-inotify-survey-fr \
locale-kde-inotify-survey-gl \
locale-kde-inotify-survey-id \
locale-kde-inotify-survey-it \
locale-kde-inotify-survey-ja \
locale-kde-inotify-survey-ka \
locale-kde-inotify-survey-ko \
locale-kde-inotify-survey-lt \
locale-kde-inotify-survey-nl \
locale-kde-inotify-survey-pl \
locale-kde-inotify-survey-pt \
locale-kde-inotify-survey-ru \
locale-kde-inotify-survey-sk \
locale-kde-inotify-survey-sl \
locale-kde-inotify-survey-sv \
locale-kde-inotify-survey-tr \
locale-kde-inotify-survey-uk \
locale-kde-inotify-survey-zh-CN \
locale-kde-inotify-survey-zh-TW"

RDEPENDS:${PN} += "kde-inotify-survey"

inherit rpm
