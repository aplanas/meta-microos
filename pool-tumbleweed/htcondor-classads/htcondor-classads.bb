SUMMARY = "HTCondor's classified advertisement language"
DESCRIPTION = "Classified Advertisements (classads) are the lingua franca of \
HTCondor. They are used for describing jobs, workstations, and other \
resources. They are exchanged by HTCondor processes to schedule \
jobs. They are logged to files for statistical and debugging \
purposes. They are used to enquire about current state of the system. \
 \
A classad is a mapping from attribute names to expressions. In the \
simplest cases, the expressions are simple constants (integer, \
floating point, or string). A classad is thus a form of property \
list. Attribute expressions can also be more complicated. There is a \
protocol for evaluating an attribute expression of a classad vis a vis \
another ad. For example, the expression 'other.size > 3' in one ad \
evaluates to true if the other ad has an attribute named size and the \
value of that attribute is (or evaluates to) an integer greater than \
three. Two classads match if each ad has an attribute requirements \
that evaluates to true in the context of the other ad. Classad \
matching is used by the HTCondor central manager to determine the \
compatibility of jobs and workstations where they may be run."
LICENSE = "Apache-2.0"

PV = "9.0.16"

RPM_NAME = "htcondor-classads-9.0.16-1.3.aarch64.rpm"
RPM_HASH = "c89505a914251200cd123cc71287408f35c30614fc381b6801a9f6e94147d0b2ab81b532f803e1a5cf6166efd0a9a068d6bf71ea54d3eab37fa6632ca7c0bec0"

RPROVIDES:${PN} += "classads \
htcondor-classads \
htcondor-classads(aarch-64) \
libclassad.so.15()(64bit)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
