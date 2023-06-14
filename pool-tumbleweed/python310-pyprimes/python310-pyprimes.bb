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

RPM_NAME = "python310-pyprimes-0.2.2a-1.20.noarch.rpm"
RPM_HASH = "dc044e77deeb9764738724de376d5cb8a6b8d6b7a11d261f80886e39470e5e1c8095569d66934bcad18a8ec678581ec7dc3b2176cd62c6ab3cd16e73eda4446b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprimes \
python3.10dist-pyprimes \
python310-pyprimes \
python3dist-pyprimes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
