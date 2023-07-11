SUMMARY = "Modular source code checker: pep8, pyflakes and co"
DESCRIPTION = "Flake8 is a modular extensible source code checker including wrappers \
around these tools: \
 \
- PyFlakes \
- pep8 \
- Ned Batchelder's McCabe script \
 \
Flake8 runs all the tools by launching the single ``flake8`` script."
LICENSE = "MIT"

PV = "6.0.0"

RPM_NAME = "python39-flake8-6.0.0-2.3.noarch.rpm"
RPM_HASH = "805362a060f0432983a6fa16e77c16be61c5e6f2655f06ec63339dd48b19330da150b26d5a75db35029caf90eb21f5dc1fcce7740bb74466ff74e6c380c993c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flake8 \
python39-flake8 \
python3dist-flake8"

RDEPENDS:${PN} += "-python39-mccabe >= 0.7.0 with python39-mccabe < 0.8.0 \
-python39-pycodestyle >= 2.10.0 with python39-pycodestyle < 2.11.0 \
-python39-pyflakes >= 3.0.0 with python39-pyflakes < 3.1.0 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
