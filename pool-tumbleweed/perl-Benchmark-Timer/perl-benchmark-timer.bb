SUMMARY = "Benchmarking with statistical confidence"
DESCRIPTION = "The Benchmark::Timer class allows you to time portions of code \
conveniently, as well as benchmark code by allowing timings of repeated \
trials. It is perfect for when you need more precise information about the \
running time of portions of your code than the Benchmark module will give \
you, but don't want to go all out and profile your code. \
 \
The methodology is simple; create a Benchmark::Timer object, and wrap \
portions of code that you want to benchmark with 'start()' and 'stop()' \
method calls. You can supply a tag to those methods if you plan to time \
multiple portions of code. If you provide error and confidence values, you \
can also use 'need_more_samples()' to determine, statistically, whether you \
need to collect more data. \
 \
After you have run your code, you can obtain information about the running \
time by calling the 'results()' method, or get a descriptive benchmark \
report by calling 'report()'. If you run your code over multiple trials, \
the average time is reported. This is wonderful for benchmarking \
time-critical portions of code in a rigorous way. You can also optionally \
choose to skip any number of initial trials to cut down on initial case \
irregularities."
LICENSE = "GPL-2.0-or-later"

PV = "0.7112"

RPM_NAME = "perl-Benchmark-Timer-0.7112-1.18.noarch.rpm"
RPM_HASH = "da2df49c6ec464b92207df5a07709c10c7fc04a934e8a8a6f7ebf2027124bdae95769800363c9bf3b8b88f682b75d397c5ffaa466408b86b73203707ea3e4c3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Benchmark--Timer \
perl-Benchmark-Timer"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
