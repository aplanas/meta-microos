SUMMARY = "Launch jobs, organize the output, and dissect the results"
DESCRIPTION = "Lancet is designed to help you organize the output of your research \
tools, store it, and dissect the data you have collected. The output \
of a single simulation or analysis rarely contains all the data you \
need; Lancet helps you generate data from many runs and analyse it \
using your own Python code. \
 \
Parameter spaces often need to be explored for the purpose of \
plotting, tuning, or analysis. Lancet helps you extract the \
information you care about from potentially enormous volumes of data \
generated by such parameter exploration."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "python311-lancet-ioam-0.9.0-2.22.noarch.rpm"
RPM_HASH = "1716ef36b4e1f38f7ec76de8257cdb4efa37adc1e50d808b5fa4aae2d5aa1f4fdb6c5b1f5f9f3271c9bd8f05822deed3c5f65b535eb5300a8632bc6b72945cb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(lancet-ioam) \
python311-lancet-ioam \
python3dist(lancet-ioam)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm