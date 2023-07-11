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

RPM_NAME = "python39-lancet-ioam-0.9.0-2.23.noarch.rpm"
RPM_HASH = "4a6a5f638ae5e5e781da9018464fb5026864a006435bfa88f9b69513b0128948f901a0390b3cebfaa284f2d27015e5baa7879763aeb6fb44256c65598754f4a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lancet-ioam \
python39-lancet-ioam \
python3dist-lancet-ioam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
