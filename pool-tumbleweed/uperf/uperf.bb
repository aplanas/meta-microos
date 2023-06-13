SUMMARY = "Unified Network Performance Tool"
DESCRIPTION = "uperf is a network performance tool that supports modelling and replay of \
various networking patterns. uperf was developed by the Performance \
Applications Engineering group at Sun Microsystems and is released under the \
GNU General Public License Version 3. \
 \
uperf represents the next generation benchmarking tools (like filebench) where \
instead of running a fixed benchmark or workload, a description (or model) of \
the workload is provided and the tool generates the load according to the \
model. By distilling the benchmark or workload into a model, you can now do \
various things like change the scale of the workload, change different \
parameters, change protocols, etc and analyse the effect of these changes on \
your model. You can also study the effect of interleaving CPU activity, or \
think times or the use of SSL instead of TCP among many other things. \
 \
Some of the questions you could answer using uperf are \
* Bandwidth and latency (unidirectional and bi-directional) with different \
  protocols like TCP, UDP, SCTP, SSL \
* Connection setup and teardown scalability for different protocols \
* Effect of noise on ongoing network connections \
* Does it matter if I use processes instead of threads to do network \
  communication? \
* What is the L2 cache miss rate for connection setup? \
* Understand TCP, UDP, SCTP, SSL performance under a variety of conditions \
and much more!"
LICENSE = "GPL-3.0-only"

PV = "1.0.7"

RPM_NAME = "uperf-1.0.7-1.14.aarch64.rpm"
RPM_HASH = "bc18a38b73cfb422dd90057ec7ff203cd9a991dea79032b082d943dc17e7aea0de2ecce31fa5df2c555aad4f896213d941cfd6936493012441ea5251e730799e"

RPROVIDES:${PN} += "uperf \
uperf(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libm.so.6()(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libssl.so.3()(64bit)"

inherit rpm
