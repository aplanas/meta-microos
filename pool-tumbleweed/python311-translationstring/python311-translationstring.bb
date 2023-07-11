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

RPM_NAME = "python311-translationstring-1.4-3.3.noarch.rpm"
RPM_HASH = "96ef46f2773e40c89eb962943cae6a37adac1c0fae54d239c447c4f566993029b0047cc8ad82ac8ef49c7555e60c773317ff5cf8111fd61421a5b1ab3df4f553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-translationstring \
python3.11dist-translationstring \
python311-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
