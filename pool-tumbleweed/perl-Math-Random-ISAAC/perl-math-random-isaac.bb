SUMMARY = "Perl interface to the ISAAC PRNG algorithm"
DESCRIPTION = "As with other Pseudo-Random Number Generator (PRNG) algorithms like the \
Mersenne Twister (see Math::Random::MT), this algorithm is designed to \
take some seed information and produce seemingly random results as output. \
However, ISAAC (Indirection, Shift, Accumulate, Add, and Count) has \
different goals than these commonly used algorithms. In particular, it's \
really fast - on average, it requires only 18.75 machine cycles to \
generate a 32-bit value. This makes it suitable for applications where a \
significant amount of random data needs to be produced quickly, such \
solving using the Monte Carlo method or for games. \
The results are uniformly distributed, unbiased, and unpredictable unless \
you know the seed. The algorithm was published by Bob Jenkins in the late \
90s and despite the best efforts of many security researchers, no feasible \
attacks have been found to date."
LICENSE = "GPL-2.0+ | Artistic-1.0"

PV = "1.004"

RPM_NAME = "perl-Math-Random-ISAAC-1.004-2.20.noarch.rpm"
RPM_HASH = "74f30022051ccfd01675364ebb1e4029222b786b893f6341c2c01f4e7f009c0c2569514aa46fd2e7a44aa24191fbefd85785b2494b1845ecb1d3f6d502f4c4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Math--Random--ISAAC \
perl-Math--Random--ISAAC--PP \
perl-Math-Random-ISAAC"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
