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

RPM_NAME = "python310-translationstring-1.4-3.3.noarch.rpm"
RPM_HASH = "3ccca25271fda42602e087dbfb17d73c2e4cb12d5d1955840c15756a18d3c8c67759685677e6ccbd6b509c22a2abdf521fcb953a04fb682180d921e776d1b777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-translationstring \
python310-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
