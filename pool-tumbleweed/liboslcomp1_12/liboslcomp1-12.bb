SUMMARY = "OpenShadingLanguage's compiler component library"
DESCRIPTION = "Open Shading Language (OSL) is a language for programmable shading \
in advanced renderers and other applications, ideal for describing \
materials, lights, displacement, and pattern generation."
LICENSE = "BSD-3-Clause"

PV = "1.12.10.0"

RPM_NAME = "liboslcomp1_12-1.12.10.0-2.1.aarch64.rpm"
RPM_HASH = "725247649affac550c61aeaf9daea1db9aa34598b45ffb545a84020a2f91574998679260abcbb8f40d4808f77959e441837730da60932e41a0ae6769903ba21d"

RPROVIDES:${PN} += "liboslcomp.so.1.12 \
liboslcomp1-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libOpenImageIO-Util.so.2.4 \
libc.so.6 \
libclang-cpp.so.15 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
