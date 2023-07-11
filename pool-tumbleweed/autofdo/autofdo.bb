SUMMARY = "A tool to convert perf.data profile to AutoFDO profile"
DESCRIPTION = "This package contains a tool to convert perf.data profile to AutoFDO \
profile that can be used by GCC and LLVM. \
 \
Each compiler is supported by a different tool. For GCC, use \
'create_gcov'. For LLVM, use 'create_llvm_prof'. The two tools \
have compatible command line flags. However, the outputs are \
incompatible. You cannot use the profile generated for GCC in \
LLVM and vice-versa."
LICENSE = "Apache-2.0"

PV = "0.18"

RPM_NAME = "autofdo-0.18-5.7.aarch64.rpm"
RPM_HASH = "ee8133f9ffc8a5cf248cffe2fd68afe64a71c180b6d1ab7e484454ec26883d05068ffd678c83c3ffad8a60db94f9fc5ec60bc4040be512827faeb41078888061"

RPROVIDES:${PN} += "autofdo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
