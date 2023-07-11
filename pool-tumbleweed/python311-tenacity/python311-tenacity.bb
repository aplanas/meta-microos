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

RPM_NAME = "python311-tenacity-8.2.2-1.3.noarch.rpm"
RPM_HASH = "a1dd24cea901dee7ed1ccc0896cbce6bdb3fe178651f1ea97360983fe8a961c0b358275676c276867d0c973f85e34729e59a989c7ff7b6509a9313530c20a28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tenacity \
python3.11dist-tenacity \
python311-tenacity \
python3dist-tenacity"

RDEPENDS:${PN} += "python-abi"

inherit rpm
