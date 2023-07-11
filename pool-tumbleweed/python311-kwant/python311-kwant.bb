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

RPM_NAME = "python311-kwant-1.4.3-1.2.aarch64.rpm"
RPM_HASH = "3091d513d08a94269ebf024b2bc6cf266577238cda079261d643fe0cea52f46e930a2d1d9a8a49877a9b0679f141766362dc416ffb065a3cb0c7decde121e603"

RPROVIDES:${PN} += "python3-kwant \
python3.11dist-kwant \
python311-kwant \
python3dist-kwant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmumps-seq.so.5.3.5 \
python-abi \
python311-numpy \
python311-scipy \
python311-tinyarray"

inherit rpm
