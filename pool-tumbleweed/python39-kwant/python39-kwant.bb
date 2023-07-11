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

RPM_NAME = "python39-kwant-1.4.3-1.2.aarch64.rpm"
RPM_HASH = "db48063d5b6227489f8fcc2974532bd1a40595561961e82460064358be2e202da8adb6fbad02db35618d4aadc7d5b50b7a15c26b4c16c732e40f1651d4c8ea2f"

RPROVIDES:${PN} += "python3.9dist-kwant \
python39-kwant \
python3dist-kwant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzmumps-seq.so.5.3.5 \
python-abi \
python39-numpy \
python39-scipy \
python39-tinyarray"

inherit rpm
