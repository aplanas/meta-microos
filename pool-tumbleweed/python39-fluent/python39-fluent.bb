SUMMARY = "Localization library for expressive translations"
DESCRIPTION = "A localization framework for natural language translations."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "python39-fluent-0.10.0-3.13.noarch.rpm"
RPM_HASH = "c6c6aac3905e6cf4e8f5771927a569ea5392d94e720170d77d7f3bae5bbf36c1f190e8a15b8654120ad688626c0ab7d7323d116d8ab371f4500d2da106d7cabb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fluent \
python39-fluent \
python3dist-fluent"

RDEPENDS:${PN} += "python-abi"

inherit rpm
