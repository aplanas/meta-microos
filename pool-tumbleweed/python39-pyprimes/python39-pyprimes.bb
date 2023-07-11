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

RPM_NAME = "python39-pyprimes-0.2.2a-1.22.noarch.rpm"
RPM_HASH = "21add5e8726fffca28a5ef0d9372f405df1f45c400f19776a8b5478bd098811c6bf2696ca48de57b6780a5d77ebeef1e5b965bb9b1b019a1dff6d1bc740af7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyprimes \
python39-pyprimes \
python3dist-pyprimes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
