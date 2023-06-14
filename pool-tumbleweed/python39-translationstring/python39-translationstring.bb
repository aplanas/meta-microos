SUMMARY = "Utility library for i18n relied on by various Repoze and Pyramid packages"
DESCRIPTION = "A library used by various Pylons Project packages for internationalization \
(i18n) duties related to translation. \
 \
This package provides a translation string class, a translation string factory \
class, translation and pluralization primitives, and a utility that helps \
Chameleon templates use translation facilities of this package. It does not \
depend on Babel, but its translation and pluralization services are meant to \
work best when provided with an instance of the babel.support.Translations class."
LICENSE = "SUSE-Repoze"

PV = "1.4"

RPM_NAME = "python39-translationstring-1.4-2.12.noarch.rpm"
RPM_HASH = "7e0b550e9bfdc580b09ad95844db17de4b1366abfec59136318b951597f478d1032cefa44a88bffd48c8420720d9de40411109bf0c372d53b5a88e9291e9d5bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translationstring \
python39-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
