SUMMARY = "A collection of fast NumPy array functions"
DESCRIPTION = "Bottleneck is a collection of fast NumPy array functions written in C."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "1.3.7"

RPM_NAME = "python39-Bottleneck-1.3.7-1.4.aarch64.rpm"
RPM_HASH = "d293fe1bc204d7ce44dbdb211c7f9636f3389069a87b9546a153adf5a5fbd56a69b8d61cd29a8b15ef59588f904fad0206b20fed34fab88cca11d7f02206737e"

RPROVIDES:${PN} += "python3.9dist(bottleneck) \
python39-Bottleneck \
python39-Bottleneck(aarch-64) \
python3dist(bottleneck)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
python(abi) \
python39-numpy"

inherit rpm
