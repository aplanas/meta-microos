SUMMARY = "Python module for retrying code until it succeeeds"
DESCRIPTION = "Tenacity is a general-purpose retrying library, written in Python, to simplify \
the task of adding retry behavior to just about anything. \
It originates from a fork of `Retrying`_ \
Features \
-------- \
- Generic Decorator API \
- Specify stop condition (i.e. limit by number of attempts) \
- Specify wait condition (i.e. exponential backoff sleeping between attempts) \
- Customize retrying on Exceptions \
- Customize retrying on expected returned result"
LICENSE = "Apache-2.0"

PV = "8.2.2"

RPM_NAME = "python310-tenacity-8.2.2-1.3.noarch.rpm"
RPM_HASH = "789de4cd434f58b369f1a7dc06c16f65027904d5203a3d20947476ace242ee31b0f56cc3910613884ddeb98c71f2f16623f4b0f8aab9598920298daebe525b35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tenacity \
python310-tenacity \
python3dist-tenacity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
