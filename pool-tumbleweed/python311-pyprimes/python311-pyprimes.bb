SUMMARY = "Generate and test for prime numbers"
DESCRIPTION = "The pyprimes package offers a variety of algorithms for generating prime \
numbers and fast primality tests, written in pure Python. \
 \
Prime numbers are those positive integers which are not divisible exactly \
by any number other than itself or one. Generating primes and testing for \
primality has been a favourite mathematical pastime for centuries, as well \
as of great practical importance for encrypting data. \
 \
``pyprimes`` includes the following features: \
 \
    - Produce prime numbers lazily, on demand. \
    - Effective algorithms including Sieve of Eratosthenes, Croft Spiral, \
      and Wheel Factorisation. \
    - Efficiently test whether numbers are prime, using both deterministic \
      (exact) and probabilistic primality tests. \
    - Examples of what *not* to do are provided, including naive trial \
      division, Turner's algorithm, and primality testing using a \
      regular expression. \
    - Factorise small numbers into the product of prime factors. \
    - Suitable for Python 2.4 through 3.x from one code base."
LICENSE = "MIT"

PV = "0.2.2a"

RPM_NAME = "python311-pyprimes-0.2.2a-1.20.noarch.rpm"
RPM_HASH = "4e0afe9b617dd1ee0d2b430210f961c78c3d38c2a2c9c70a95ced6fc30191267bee6644d4fa1cfbc88a6bba044fb77e8cb5a6453e3d90a787f730a2a15cca1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyprimes) \
python311-pyprimes \
python3dist(pyprimes)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
