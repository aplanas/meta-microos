SUMMARY = "Relaxed test discovery/organization for pytest"
DESCRIPTION = "Relaxed test discovery/organization plugin for pytest from python-paramiko author"
LICENSE = "BSD-2-Clause"

PV = "2.0.1"

RPM_NAME = "python310-pytest-relaxed-2.0.1-1.3.noarch.rpm"
RPM_HASH = "333887ccc1c5af7b13da398db0741daccc69519efcfb4c06b26961c915ad67f573326651024668a5a9b080b99577e33d931a4a815c5c6e57ef56eee5df56b685"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-relaxed \
python310-pytest-relaxed \
python3dist-pytest-relaxed"

RDEPENDS:${PN} += "python-abi \
python310-decorator \
python310-pytest"

inherit rpm
