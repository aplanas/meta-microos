SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-crochet-2.0.0-1.10.noarch.rpm"
RPM_HASH = "94bef6e778de4bf5bfe7e4f4fa6bbee910aa1250e3f5fa5cb874201d763ed834db887b68a9cae721ca459bf85685230fd5ea0f58bf17e4c0ab54349a81353b0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-crochet \
python310-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python310-Twisted \
python310-wrapt"

inherit rpm
