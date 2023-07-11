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

RPM_NAME = "python39-translationstring-1.4-3.3.noarch.rpm"
RPM_HASH = "5df5d0f6a5a93cb21d7a8f8b19b63e03b99bfa2a24495ce4efc7210498498d01508f45b180b4bddae88c7494f616c4083eb96da1f71ff73a4f41b6f764cbfb42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-translationstring \
python39-translationstring \
python3dist-translationstring"

RDEPENDS:${PN} += "python-abi"

inherit rpm
