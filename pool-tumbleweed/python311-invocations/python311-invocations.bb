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

RPM_NAME = "python311-invocations-3.0.2-1.1.noarch.rpm"
RPM_HASH = "e24245ce420ae74e9bceb8a785c884cf3aefb12ed21d6c24e4cc9d7ad54772ab942d0cd65f2c2de46e60675783dac752e41ff70da7387696dc2c1e4f934f6a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(invocations) \
python311-invocations \
python3dist(invocations)"
RDEPENDS:${PN} += "python(abi) \
python311-blessings \
python311-invoke \
python311-lexicon \
python311-releases \
python311-semantic_version \
python311-six \
python311-tabulate \
python311-tqdm \
python311-twine \
python311-wheel"

inherit rpm
