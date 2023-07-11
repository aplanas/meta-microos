SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python39-path-16.6.0-2.3.noarch.rpm"
RPM_HASH = "104a00ceeccacf79da30aeccc9decd1ede79a6f9ac11af6b0be2e3eec693cd30c1b4ca6c8e4a0c11294fa6b23330c0f81c1efa82576d60cb224ae45c06cb3ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-path \
python39-path \
python39-path.py \
python3dist-path"

RDEPENDS:${PN} += "python-abi"

inherit rpm
