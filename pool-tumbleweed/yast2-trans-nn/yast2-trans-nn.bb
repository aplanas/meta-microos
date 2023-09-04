SUMMARY = "YaST2 - Norwegian Nynorsk"
DESCRIPTION = "YaST2 - Translations for Norwegian Nynorsk."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-nn-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "81d4cacb20ced61c3595a237b5fae74b673d25b1c01c9f05032bb1d9941ad977bc7b32eaa6edf86580addcb64f6673b778257237d20ef36d9422fe2b808cef05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-nn \
yast2-trans-nn"

RDEPENDS:${PN} += ""

inherit rpm
