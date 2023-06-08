SUMMARY = "Translations for package Font-Downloader"
DESCRIPTION = "Provides translations for the 'Font-Downloader' package."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "Font-Downloader-lang-10.0.0-1.2.noarch.rpm"
RPM_HASH = "a54f28d4a4cf18c4e81d6eb18aa03cfaeef1b5ef9a7faa08bcb4e0cb14f6c7ba6d6822326fc8ba3329e78c70b54ed955f0fac5de1756fe8f02f40aed0218af76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "Font-Downloader-lang Font-Downloader-lang-all locale(Font-Downloader:bn) locale(Font-Downloader:ca) locale(Font-Downloader:cs) locale(Font-Downloader:de) locale(Font-Downloader:en_GB) locale(Font-Downloader:es) locale(Font-Downloader:fa) locale(Font-Downloader:fi) locale(Font-Downloader:gl) locale(Font-Downloader:he) locale(Font-Downloader:hi) locale(Font-Downloader:hr) locale(Font-Downloader:id) locale(Font-Downloader:ja) locale(Font-Downloader:nl) locale(Font-Downloader:pl) locale(Font-Downloader:pt_BR) locale(Font-Downloader:pt_PT) locale(Font-Downloader:ru) locale(Font-Downloader:sv) locale(Font-Downloader:tr) locale(Font-Downloader:zh_CN)"
RDEPENDS:${PN} += "Font-Downloader"

inherit rpm
