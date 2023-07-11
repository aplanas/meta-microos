SUMMARY = "Python plugin loader"
DESCRIPTION = "straight.plugin is a Python plugin loader inspired by twisted.plugin with two \
important distinctions: \
 \
 - Fewer dependencies \
 - Python 3 compatible \
 \
The system is used to allow multiple Python packages to provide plugins within \
a namespace package, where other packages will locate and utilize. The plugins \
themselves are modules in a namespace package where the namespace identifies \
the plugins in it for some particular purpose or intent."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-straight-plugin-1.5.0-2.13.noarch.rpm"
RPM_HASH = "4d9032503b02869de316b3cbc11e397ff78b80378ff8501abc7218fc8baa9c5904cd8ed99a83d861ec8d64d1f9828c977d80bea545c29b4036f0b7597d593ea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-straight.plugin \
python310-straight-plugin \
python3dist-straight.plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
