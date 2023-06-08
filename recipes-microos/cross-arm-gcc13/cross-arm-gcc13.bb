SUMMARY = "The GNU Compiler Collection targeting arm"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm. \
 \
Note this is only useful for building freestanding things like the \
kernel since it fails to include target libraries and headers."
LICENSE = "GPL-3.0-or-later"

PV = "13.0.1+git7231"

RPM_NAME = "cross-arm-gcc13-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "85dc34d823230f7b2b9d1fd0cf3783637a90a36232d7a45085ead7890a73ac66e2fd3d76398b2b5e6372b5b0bf88f18bfbf3030bdda5bce02fd22b7e2738a404"

RPROVIDES:${PN} += "cross-arm-gcc13 cross-arm-gcc13(aarch-64)"
RDEPENDS:${PN} += "/bin/sh cross-arm-binutils libstdc++6-devel-gcc13 update-alternatives"

inherit rpm
