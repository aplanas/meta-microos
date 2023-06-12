SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python310-fluent-0.10.0-3.11.noarch.rpm"
RPM_HASH = "8794c0e5d51c08c232cc81cce15f054aef97c6464fb496c89a77948f2ea00341450564d84c1f050f60e9c8a08169db0f03fbeb42b2926dbae7eb80df59782f38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fluent \
python3.10dist(fluent) \
python310-fluent \
python3dist(fluent)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
