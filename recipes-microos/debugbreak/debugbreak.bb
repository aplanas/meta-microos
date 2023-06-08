SUMMARY = "Breakpoint injector for C/C++ code"
DESCRIPTION = "debugbreak.h allows setting breakpoints in C/C++ code with a call to \
the debug_break() function. \
 \
* Include one header file and insert calls to debug_break() in the code where \
  you wish to trap into the debugger. \
* Works well on ARM, AArch64, i686, x86-64, POWER and has a fallback code path \
  for other architectures. \
* Works like the DebugBreak() fuction provided by Windows and QNX."
LICENSE = "BSD-2-Clause"

PV = "1.0~git.20210702"

RPM_NAME = "debugbreak-1.0~git.20210702-1.2.noarch.rpm"
RPM_HASH = "69cdf2a0458245d6978db667cbbbac327ec0be4b2f40611f5311a90e0bd4591d02a20d819ab911e2ad77de66ab875840957d1a1bb2e4e0ac8f885f1881930ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "debugbreak"
RDEPENDS:${PN} += ""

inherit rpm
