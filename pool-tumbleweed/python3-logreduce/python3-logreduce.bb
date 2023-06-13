SUMMARY = "Log file anomaly extractor"
DESCRIPTION = "Based on success logs, logreduce highlights useful text in failed logs. \
The goal is to save time in finding a failure's root cause. \
 \
On average, learning run at 2000 lines per second, and \
testing run at 1300 lines per seconds. \
 \
logreduce uses a *model* to learn successful logs and detect novelties in \
failed logs: \
 \
* Random words are manually removed using regular expression \
* Then lines are converted to a matrix of token occurrences \
  (using **HashingVectorizer**), \
* An unsupervised learner implements neighbor searches \
  (using **NearestNeighbors**)."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "python3-logreduce-0.6.1-2.7.noarch.rpm"
RPM_HASH = "ed3a49e3ce711cc0668c8b1cc7a4428a714ad6abcf3bf353ba8e7566ca662e14796c87fb94033e255eb9d5e5ab5bd8079cae8692dd9a7ffaab76aa8c937c5453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-logreduce \
python3.10dist(logreduce) \
python3dist(logreduce)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-CherryPy \
python3-PyYAML \
python3-SQLAlchemy \
python3-aiohttp \
python3-alembic \
python3-gear \
python3-numpy \
python3-requests \
python3-scikit-learn \
python3-scipy \
python3-voluptuous"

inherit rpm
