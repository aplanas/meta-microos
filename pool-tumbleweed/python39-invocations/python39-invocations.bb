SUMMARY = "Reusable Invoke tasks"
DESCRIPTION = "Invocations is a collection of reusable `Invoke <http://pyinvoke.org>`_ \
tasks/task modules, including (but not limited to) Python project management \
tools such as documentation building and dependency organization. \
 \
It has no stand-alone components and is designed to be imported into your \
pre-existing Invoke task files. \
 \
Invocations is currently in pre-alpha status and is unsupported. Please follow \
the Invoke project's communication channels for updates. Thanks!"
LICENSE = "BSD-2-Clause"

PV = "3.0.2"

RPM_NAME = "python39-invocations-3.0.2-1.1.noarch.rpm"
RPM_HASH = "6acc3417137666624d608e5178753c89cb906d1d837229bf7daa50bee0c1b844b0436f0d7a79dc05603d2c3af6f5bcaa21275b7c39d23e983cb8dfd8427b628c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(invocations) \
python39-invocations \
python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) \
python39-blessings \
python39-invoke \
python39-lexicon \
python39-releases \
python39-semantic_version \
python39-six \
python39-tabulate \
python39-tqdm \
python39-twine \
python39-wheel"

inherit rpm
