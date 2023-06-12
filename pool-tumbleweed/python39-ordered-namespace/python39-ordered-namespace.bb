SUMMARY = "Python namespace class"
DESCRIPTION = "A Python namespace class derived from OrderedDict, \
including tab-completion"
LICENSE = "MIT"

PV = "2019.6.8"

RPM_NAME = "python39-ordered-namespace-2019.6.8-1.19.noarch.rpm"
RPM_HASH = "55c48667d9e3301c4129eb0d07e42306f02172a50d28a8a4d24a62af50c4a4f26d362a7a4e8b99130fb251449e1b7e7a4440a8f308205bd18e3437e986b35515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ordered-namespace) \
python39-ordered-namespace \
python3dist(ordered-namespace)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
