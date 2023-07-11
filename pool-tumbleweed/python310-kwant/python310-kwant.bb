SUMMARY = "Python library for numerical quantum transport calculations"
DESCRIPTION = "Kwant is a Python library for numerical calculations on tight-binding \
models with a strong focus on quantum transport. Kwant can be used to \
simulate a variety of systems and phenomena in quantum physics \
including: metals, graphene, topological insulators, quantum Hall \
effect, superconductivity, spintronics, molecular electronics, any \
combination of the above, and many other things. Kwant can calculate \
transport properties (conductance, noise, scattering matrix), \
dispersion relations, modes, wave functions, various Green’s \
functions, out-of-equilibrium local quantities."
LICENSE = "BSD-2-Clause"

PV = "1.4.3"

RPM_NAME = "python310-kwant-1.4.3-1.2.aarch64.rpm"
RPM_HASH = "ffb33144dd7b4c4fd00020bb4c19115e38d825e7f8fc6f9bc60d86726df70781f9fd43ee4575689b1e06c866132c3d435c1496e9be4d700bed0b20d1d5d9605f"

RPROVIDES:${PN} += "python3.10dist-kwant \
python310-kwant \
python3dist-kwant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmumps-seq.so.5.3.5 \
python-abi \
python310-numpy \
python310-scipy \
python310-tinyarray"

inherit rpm
