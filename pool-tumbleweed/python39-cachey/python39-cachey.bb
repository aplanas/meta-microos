SUMMARY = "A Python cache mindful of computation/storage costs"
DESCRIPTION = "Cachey tries to hold on to values that have the following characteristics \
 \
1. Expensive to recompute (in seconds) \
2. Cheap to store (in bytes) \
3. Frequently used \
4. Recenty used \
 \
It accomplishes this by adding the following to each items score on each access \
 \
    score += compute_time / num_bytes * (1 + eps) ** tick_time \
 \
For some small value of epsilon (which determines the memory halflife). This \
has units of inverse bandwidth, has exponential decay of old results and \
roughly linear amplification of repeated results."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python39-cachey-0.2.1-2.5.noarch.rpm"
RPM_HASH = "854f1085a9810b96faa1175837be99cec743a921b9602430111c24c8b48bdd9500e312028e94fe7285562b1e64817b82e62976e99262568e5dd10caade1485e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cachey \
python39-cachey \
python3dist-cachey"

RDEPENDS:${PN} += "python-abi \
python39-HeapDict"

inherit rpm
