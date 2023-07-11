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

RPM_NAME = "python39-invocations-3.0.2-2.3.noarch.rpm"
RPM_HASH = "3f692087fdd6997b74a19195028a4e13fcb7c628606fb4e2bd9a83f844cad777e9b9c452da85c04622885cdf682600648f55012e07281407085cb9ecf5b73bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-invocations \
python39-invocations \
python3dist-invocations"

RDEPENDS:${PN} += "python-abi \
python39-blessings \
python39-invoke \
python39-lexicon \
python39-releases \
python39-semantic-version \
python39-tabulate \
python39-tqdm \
python39-twine \
python39-wheel"

inherit rpm
