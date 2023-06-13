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

RPM_NAME = "python39-straight-plugin-1.5.0-2.12.noarch.rpm"
RPM_HASH = "a7fab783ae42a925ff76167b0afcfa597e509f5a977eb6c73ad21bfa41df75488de7c0a2cc19a319a603ae2bcf01c4c65a99b108d77a8155809f3fa3da2b856b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(straight.plugin) \
python39-straight-plugin \
python3dist(straight.plugin)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
