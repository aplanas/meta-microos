SUMMARY = "An Interpreted Object-Oriented Scripting Language"
DESCRIPTION = "Ruby is an interpreted scripting language for object-oriented programming. It \
has many features for processing text files and performing system management \
tasks (as in Perl).  It is extensible. \
 \
* Ruby features: \
 \
- Simple Syntax \
 \
- *Normal* Object-Oriented features (class, method calls, for \
   example) \
 \
- *Advanced* Object-Oriented features(Mix-in, Singleton-method, for \
   example) \
 \
- Operator Overloading \
 \
- Exception Handling \
 \
- Iterators and Closures \
 \
- Garbage Collection \
 \
- Dynamic Loading of Object Files (on some architectures)"
LICENSE = "BSD-2-Clause | Ruby"

PV = "3.2.2"

RPM_NAME = "ruby3.2-3.2.2-1.2.aarch64.rpm"
RPM_HASH = "f3290647b98218c662cbbb1a35976ffd04fa89bd07e6fc3a98704ff47292e79041ef3c855c5cded33ad7029e5ffe0146158ae94492ee6db1bffd739b262ecdd8"

RPROVIDES:${PN} += "rpm-macro-rb-build-ruby-abis \
rpm-macro-rb-build-versions \
rpm-macro-rb-default-ruby \
rpm-macro-rb-default-ruby-abi \
rpm-macro-rb-default-ruby-suffix \
rpm-macro-rubydevelruby32 \
rpm-macro-rubydevelxruby32 \
rpm-macro-rubygemsruby32 \
rpm-macro-rubygemsxruby32 \
rpm-macro-rubyruby32 \
rpm-macro-rubyxruby32 \
ruby-abi \
ruby-default \
ruby3.2 \
ruby3.2-stdlib \
ruby32 \
rubygem-abbrev \
rubygem-base64 \
rubygem-benchmark \
rubygem-bigdecimal \
rubygem-bundler \
rubygem-cgi \
rubygem-csv \
rubygem-date \
rubygem-debug \
rubygem-delegate \
rubygem-did-you-mean \
rubygem-digest \
rubygem-drb \
rubygem-english \
rubygem-erb \
rubygem-error-highlight \
rubygem-etc \
rubygem-fcntl \
rubygem-fiddle \
rubygem-fileutils \
rubygem-find \
rubygem-forwardable \
rubygem-getoptlong \
rubygem-io-console \
rubygem-io-nonblock \
rubygem-io-wait \
rubygem-ipaddr \
rubygem-irb \
rubygem-json \
rubygem-logger \
rubygem-matrix \
rubygem-minitest \
rubygem-mutex-m \
rubygem-net-ftp \
rubygem-net-http \
rubygem-net-imap \
rubygem-net-pop \
rubygem-net-protocol \
rubygem-net-smtp \
rubygem-nkf \
rubygem-observer \
rubygem-open-uri \
rubygem-open3 \
rubygem-openssl \
rubygem-optparse \
rubygem-ostruct \
rubygem-pathname \
rubygem-power-assert \
rubygem-pp \
rubygem-prettyprint \
rubygem-prime \
rubygem-pstore \
rubygem-psych \
rubygem-racc \
rubygem-rake \
rubygem-rbs \
rubygem-rdoc \
rubygem-readline \
rubygem-readline-ext \
rubygem-reline \
rubygem-resolv \
rubygem-resolv-replace \
rubygem-rexml \
rubygem-rinda \
rubygem-rss \
rubygem-ruby-3.2.0-abbrev \
rubygem-ruby-3.2.0-abbrev-0 \
rubygem-ruby-3.2.0-abbrev-0.1 \
rubygem-ruby-3.2.0-abbrev-0.1.1 \
rubygem-ruby-3.2.0-base64 \
rubygem-ruby-3.2.0-base64-0 \
rubygem-ruby-3.2.0-base64-0.1 \
rubygem-ruby-3.2.0-base64-0.1.1 \
rubygem-ruby-3.2.0-benchmark \
rubygem-ruby-3.2.0-benchmark-0 \
rubygem-ruby-3.2.0-benchmark-0.2 \
rubygem-ruby-3.2.0-benchmark-0.2.1 \
rubygem-ruby-3.2.0-bigdecimal \
rubygem-ruby-3.2.0-bigdecimal-3 \
rubygem-ruby-3.2.0-bigdecimal-3.1 \
rubygem-ruby-3.2.0-bigdecimal-3.1.3 \
rubygem-ruby-3.2.0-bundler \
rubygem-ruby-3.2.0-bundler-2 \
rubygem-ruby-3.2.0-bundler-2.4 \
rubygem-ruby-3.2.0-bundler-2.4.10 \
rubygem-ruby-3.2.0-cgi \
rubygem-ruby-3.2.0-cgi-0 \
rubygem-ruby-3.2.0-cgi-0.3 \
rubygem-ruby-3.2.0-cgi-0.3.6 \
rubygem-ruby-3.2.0-csv \
rubygem-ruby-3.2.0-csv-3 \
rubygem-ruby-3.2.0-csv-3.2 \
rubygem-ruby-3.2.0-csv-3.2.6 \
rubygem-ruby-3.2.0-date \
rubygem-ruby-3.2.0-date-3 \
rubygem-ruby-3.2.0-date-3.3 \
rubygem-ruby-3.2.0-date-3.3.3 \
rubygem-ruby-3.2.0-debug \
rubygem-ruby-3.2.0-debug-1 \
rubygem-ruby-3.2.0-debug-1.7 \
rubygem-ruby-3.2.0-debug-1.7.1 \
rubygem-ruby-3.2.0-delegate \
rubygem-ruby-3.2.0-delegate-0 \
rubygem-ruby-3.2.0-delegate-0.3 \
rubygem-ruby-3.2.0-delegate-0.3.0 \
rubygem-ruby-3.2.0-did-you-mean \
rubygem-ruby-3.2.0-did-you-mean-1 \
rubygem-ruby-3.2.0-did-you-mean-1.6 \
rubygem-ruby-3.2.0-did-you-mean-1.6.3 \
rubygem-ruby-3.2.0-digest \
rubygem-ruby-3.2.0-digest-3 \
rubygem-ruby-3.2.0-digest-3.1 \
rubygem-ruby-3.2.0-digest-3.1.1 \
rubygem-ruby-3.2.0-drb \
rubygem-ruby-3.2.0-drb-2 \
rubygem-ruby-3.2.0-drb-2.1 \
rubygem-ruby-3.2.0-drb-2.1.1 \
rubygem-ruby-3.2.0-english \
rubygem-ruby-3.2.0-english-0 \
rubygem-ruby-3.2.0-english-0.7 \
rubygem-ruby-3.2.0-english-0.7.2 \
rubygem-ruby-3.2.0-erb \
rubygem-ruby-3.2.0-erb-4 \
rubygem-ruby-3.2.0-erb-4.0 \
rubygem-ruby-3.2.0-erb-4.0.2 \
rubygem-ruby-3.2.0-error-highlight \
rubygem-ruby-3.2.0-error-highlight-0 \
rubygem-ruby-3.2.0-error-highlight-0.5 \
rubygem-ruby-3.2.0-error-highlight-0.5.1 \
rubygem-ruby-3.2.0-etc \
rubygem-ruby-3.2.0-etc-1 \
rubygem-ruby-3.2.0-etc-1.4 \
rubygem-ruby-3.2.0-etc-1.4.2 \
rubygem-ruby-3.2.0-fcntl \
rubygem-ruby-3.2.0-fcntl-1 \
rubygem-ruby-3.2.0-fcntl-1.0 \
rubygem-ruby-3.2.0-fcntl-1.0.2 \
rubygem-ruby-3.2.0-fiddle \
rubygem-ruby-3.2.0-fiddle-1 \
rubygem-ruby-3.2.0-fiddle-1.1 \
rubygem-ruby-3.2.0-fiddle-1.1.1 \
rubygem-ruby-3.2.0-fileutils \
rubygem-ruby-3.2.0-fileutils-1 \
rubygem-ruby-3.2.0-fileutils-1.7 \
rubygem-ruby-3.2.0-fileutils-1.7.0 \
rubygem-ruby-3.2.0-find \
rubygem-ruby-3.2.0-find-0 \
rubygem-ruby-3.2.0-find-0.1 \
rubygem-ruby-3.2.0-find-0.1.1 \
rubygem-ruby-3.2.0-forwardable \
rubygem-ruby-3.2.0-forwardable-1 \
rubygem-ruby-3.2.0-forwardable-1.3 \
rubygem-ruby-3.2.0-forwardable-1.3.3 \
rubygem-ruby-3.2.0-getoptlong \
rubygem-ruby-3.2.0-getoptlong-0 \
rubygem-ruby-3.2.0-getoptlong-0.2 \
rubygem-ruby-3.2.0-getoptlong-0.2.0 \
rubygem-ruby-3.2.0-io-console \
rubygem-ruby-3.2.0-io-console-0 \
rubygem-ruby-3.2.0-io-console-0.6 \
rubygem-ruby-3.2.0-io-console-0.6.0 \
rubygem-ruby-3.2.0-io-nonblock \
rubygem-ruby-3.2.0-io-nonblock-0 \
rubygem-ruby-3.2.0-io-nonblock-0.2 \
rubygem-ruby-3.2.0-io-nonblock-0.2.0 \
rubygem-ruby-3.2.0-io-wait \
rubygem-ruby-3.2.0-io-wait-0 \
rubygem-ruby-3.2.0-io-wait-0.3 \
rubygem-ruby-3.2.0-io-wait-0.3.0 \
rubygem-ruby-3.2.0-ipaddr \
rubygem-ruby-3.2.0-ipaddr-1 \
rubygem-ruby-3.2.0-ipaddr-1.2 \
rubygem-ruby-3.2.0-ipaddr-1.2.5 \
rubygem-ruby-3.2.0-irb \
rubygem-ruby-3.2.0-irb-1 \
rubygem-ruby-3.2.0-irb-1.6 \
rubygem-ruby-3.2.0-irb-1.6.2 \
rubygem-ruby-3.2.0-json \
rubygem-ruby-3.2.0-json-2 \
rubygem-ruby-3.2.0-json-2.6 \
rubygem-ruby-3.2.0-json-2.6.3 \
rubygem-ruby-3.2.0-logger \
rubygem-ruby-3.2.0-logger-1 \
rubygem-ruby-3.2.0-logger-1.5 \
rubygem-ruby-3.2.0-logger-1.5.3 \
rubygem-ruby-3.2.0-matrix \
rubygem-ruby-3.2.0-matrix-0 \
rubygem-ruby-3.2.0-matrix-0.4 \
rubygem-ruby-3.2.0-matrix-0.4.2 \
rubygem-ruby-3.2.0-minitest \
rubygem-ruby-3.2.0-minitest-5 \
rubygem-ruby-3.2.0-minitest-5.16 \
rubygem-ruby-3.2.0-minitest-5.16.3 \
rubygem-ruby-3.2.0-mutex-m \
rubygem-ruby-3.2.0-mutex-m-0 \
rubygem-ruby-3.2.0-mutex-m-0.1 \
rubygem-ruby-3.2.0-mutex-m-0.1.2 \
rubygem-ruby-3.2.0-net-ftp \
rubygem-ruby-3.2.0-net-ftp-0 \
rubygem-ruby-3.2.0-net-ftp-0.2 \
rubygem-ruby-3.2.0-net-ftp-0.2.0 \
rubygem-ruby-3.2.0-net-http \
rubygem-ruby-3.2.0-net-http-0 \
rubygem-ruby-3.2.0-net-http-0.3 \
rubygem-ruby-3.2.0-net-http-0.3.2 \
rubygem-ruby-3.2.0-net-imap \
rubygem-ruby-3.2.0-net-imap-0 \
rubygem-ruby-3.2.0-net-imap-0.3 \
rubygem-ruby-3.2.0-net-imap-0.3.4 \
rubygem-ruby-3.2.0-net-pop \
rubygem-ruby-3.2.0-net-pop-0 \
rubygem-ruby-3.2.0-net-pop-0.1 \
rubygem-ruby-3.2.0-net-pop-0.1.2 \
rubygem-ruby-3.2.0-net-protocol \
rubygem-ruby-3.2.0-net-protocol-0 \
rubygem-ruby-3.2.0-net-protocol-0.2 \
rubygem-ruby-3.2.0-net-protocol-0.2.1 \
rubygem-ruby-3.2.0-net-smtp \
rubygem-ruby-3.2.0-net-smtp-0 \
rubygem-ruby-3.2.0-net-smtp-0.3 \
rubygem-ruby-3.2.0-net-smtp-0.3.3 \
rubygem-ruby-3.2.0-nkf \
rubygem-ruby-3.2.0-nkf-0 \
rubygem-ruby-3.2.0-nkf-0.1 \
rubygem-ruby-3.2.0-nkf-0.1.2 \
rubygem-ruby-3.2.0-observer \
rubygem-ruby-3.2.0-observer-0 \
rubygem-ruby-3.2.0-observer-0.1 \
rubygem-ruby-3.2.0-observer-0.1.1 \
rubygem-ruby-3.2.0-open-uri \
rubygem-ruby-3.2.0-open-uri-0 \
rubygem-ruby-3.2.0-open-uri-0.3 \
rubygem-ruby-3.2.0-open-uri-0.3.0 \
rubygem-ruby-3.2.0-open3 \
rubygem-ruby-3.2.0-open3-0 \
rubygem-ruby-3.2.0-open3-0.1 \
rubygem-ruby-3.2.0-open3-0.1.2 \
rubygem-ruby-3.2.0-openssl \
rubygem-ruby-3.2.0-openssl-3 \
rubygem-ruby-3.2.0-openssl-3.1 \
rubygem-ruby-3.2.0-openssl-3.1.0 \
rubygem-ruby-3.2.0-optparse \
rubygem-ruby-3.2.0-optparse-0 \
rubygem-ruby-3.2.0-optparse-0.3 \
rubygem-ruby-3.2.0-optparse-0.3.1 \
rubygem-ruby-3.2.0-ostruct \
rubygem-ruby-3.2.0-ostruct-0 \
rubygem-ruby-3.2.0-ostruct-0.5 \
rubygem-ruby-3.2.0-ostruct-0.5.5 \
rubygem-ruby-3.2.0-pathname \
rubygem-ruby-3.2.0-pathname-0 \
rubygem-ruby-3.2.0-pathname-0.2 \
rubygem-ruby-3.2.0-pathname-0.2.1 \
rubygem-ruby-3.2.0-power-assert \
rubygem-ruby-3.2.0-power-assert-2 \
rubygem-ruby-3.2.0-power-assert-2.0 \
rubygem-ruby-3.2.0-power-assert-2.0.3 \
rubygem-ruby-3.2.0-pp \
rubygem-ruby-3.2.0-pp-0 \
rubygem-ruby-3.2.0-pp-0.4 \
rubygem-ruby-3.2.0-pp-0.4.0 \
rubygem-ruby-3.2.0-prettyprint \
rubygem-ruby-3.2.0-prettyprint-0 \
rubygem-ruby-3.2.0-prettyprint-0.1 \
rubygem-ruby-3.2.0-prettyprint-0.1.1 \
rubygem-ruby-3.2.0-prime \
rubygem-ruby-3.2.0-prime-0 \
rubygem-ruby-3.2.0-prime-0.1 \
rubygem-ruby-3.2.0-prime-0.1.2 \
rubygem-ruby-3.2.0-pstore \
rubygem-ruby-3.2.0-pstore-0 \
rubygem-ruby-3.2.0-pstore-0.1 \
rubygem-ruby-3.2.0-pstore-0.1.2 \
rubygem-ruby-3.2.0-psych \
rubygem-ruby-3.2.0-psych-5 \
rubygem-ruby-3.2.0-psych-5.0 \
rubygem-ruby-3.2.0-psych-5.0.1 \
rubygem-ruby-3.2.0-racc \
rubygem-ruby-3.2.0-racc-1 \
rubygem-ruby-3.2.0-racc-1.6 \
rubygem-ruby-3.2.0-racc-1.6.2 \
rubygem-ruby-3.2.0-rake \
rubygem-ruby-3.2.0-rake-13 \
rubygem-ruby-3.2.0-rake-13.0 \
rubygem-ruby-3.2.0-rake-13.0.6 \
rubygem-ruby-3.2.0-rbs \
rubygem-ruby-3.2.0-rbs-2 \
rubygem-ruby-3.2.0-rbs-2.8 \
rubygem-ruby-3.2.0-rbs-2.8.2 \
rubygem-ruby-3.2.0-rdoc \
rubygem-ruby-3.2.0-rdoc-6 \
rubygem-ruby-3.2.0-rdoc-6.5 \
rubygem-ruby-3.2.0-rdoc-6.5.0 \
rubygem-ruby-3.2.0-readline \
rubygem-ruby-3.2.0-readline-0 \
rubygem-ruby-3.2.0-readline-0.0 \
rubygem-ruby-3.2.0-readline-0.0.3 \
rubygem-ruby-3.2.0-readline-ext \
rubygem-ruby-3.2.0-readline-ext-0 \
rubygem-ruby-3.2.0-readline-ext-0.1 \
rubygem-ruby-3.2.0-readline-ext-0.1.5 \
rubygem-ruby-3.2.0-reline \
rubygem-ruby-3.2.0-reline-0 \
rubygem-ruby-3.2.0-reline-0.3 \
rubygem-ruby-3.2.0-reline-0.3.2 \
rubygem-ruby-3.2.0-resolv \
rubygem-ruby-3.2.0-resolv-0 \
rubygem-ruby-3.2.0-resolv-0.2 \
rubygem-ruby-3.2.0-resolv-0.2.2 \
rubygem-ruby-3.2.0-resolv-replace \
rubygem-ruby-3.2.0-resolv-replace-0 \
rubygem-ruby-3.2.0-resolv-replace-0.1 \
rubygem-ruby-3.2.0-resolv-replace-0.1.1 \
rubygem-ruby-3.2.0-rexml \
rubygem-ruby-3.2.0-rexml-3 \
rubygem-ruby-3.2.0-rexml-3.2 \
rubygem-ruby-3.2.0-rexml-3.2.5 \
rubygem-ruby-3.2.0-rinda \
rubygem-ruby-3.2.0-rinda-0 \
rubygem-ruby-3.2.0-rinda-0.1 \
rubygem-ruby-3.2.0-rinda-0.1.1 \
rubygem-ruby-3.2.0-rss \
rubygem-ruby-3.2.0-rss-0 \
rubygem-ruby-3.2.0-rss-0.2 \
rubygem-ruby-3.2.0-rss-0.2.9 \
rubygem-ruby-3.2.0-ruby2-keywords \
rubygem-ruby-3.2.0-ruby2-keywords-0 \
rubygem-ruby-3.2.0-ruby2-keywords-0.0 \
rubygem-ruby-3.2.0-ruby2-keywords-0.0.5 \
rubygem-ruby-3.2.0-securerandom \
rubygem-ruby-3.2.0-securerandom-0 \
rubygem-ruby-3.2.0-securerandom-0.2 \
rubygem-ruby-3.2.0-securerandom-0.2.2 \
rubygem-ruby-3.2.0-set \
rubygem-ruby-3.2.0-set-1 \
rubygem-ruby-3.2.0-set-1.0 \
rubygem-ruby-3.2.0-set-1.0.3 \
rubygem-ruby-3.2.0-shellwords \
rubygem-ruby-3.2.0-shellwords-0 \
rubygem-ruby-3.2.0-shellwords-0.1 \
rubygem-ruby-3.2.0-shellwords-0.1.0 \
rubygem-ruby-3.2.0-singleton \
rubygem-ruby-3.2.0-singleton-0 \
rubygem-ruby-3.2.0-singleton-0.1 \
rubygem-ruby-3.2.0-singleton-0.1.1 \
rubygem-ruby-3.2.0-stringio \
rubygem-ruby-3.2.0-stringio-3 \
rubygem-ruby-3.2.0-stringio-3.0 \
rubygem-ruby-3.2.0-stringio-3.0.4 \
rubygem-ruby-3.2.0-strscan \
rubygem-ruby-3.2.0-strscan-3 \
rubygem-ruby-3.2.0-strscan-3.0 \
rubygem-ruby-3.2.0-strscan-3.0.5 \
rubygem-ruby-3.2.0-syntax-suggest \
rubygem-ruby-3.2.0-syntax-suggest-1 \
rubygem-ruby-3.2.0-syntax-suggest-1.0 \
rubygem-ruby-3.2.0-syntax-suggest-1.0.2 \
rubygem-ruby-3.2.0-syslog \
rubygem-ruby-3.2.0-syslog-0 \
rubygem-ruby-3.2.0-syslog-0.1 \
rubygem-ruby-3.2.0-syslog-0.1.1 \
rubygem-ruby-3.2.0-tempfile \
rubygem-ruby-3.2.0-tempfile-0 \
rubygem-ruby-3.2.0-tempfile-0.1 \
rubygem-ruby-3.2.0-tempfile-0.1.3 \
rubygem-ruby-3.2.0-test-unit \
rubygem-ruby-3.2.0-test-unit-3 \
rubygem-ruby-3.2.0-test-unit-3.5 \
rubygem-ruby-3.2.0-test-unit-3.5.7 \
rubygem-ruby-3.2.0-time \
rubygem-ruby-3.2.0-time-0 \
rubygem-ruby-3.2.0-time-0.2 \
rubygem-ruby-3.2.0-time-0.2.2 \
rubygem-ruby-3.2.0-timeout \
rubygem-ruby-3.2.0-timeout-0 \
rubygem-ruby-3.2.0-timeout-0.3 \
rubygem-ruby-3.2.0-timeout-0.3.1 \
rubygem-ruby-3.2.0-tmpdir \
rubygem-ruby-3.2.0-tmpdir-0 \
rubygem-ruby-3.2.0-tmpdir-0.1 \
rubygem-ruby-3.2.0-tmpdir-0.1.3 \
rubygem-ruby-3.2.0-tsort \
rubygem-ruby-3.2.0-tsort-0 \
rubygem-ruby-3.2.0-tsort-0.1 \
rubygem-ruby-3.2.0-tsort-0.1.1 \
rubygem-ruby-3.2.0-typeprof \
rubygem-ruby-3.2.0-typeprof-0 \
rubygem-ruby-3.2.0-typeprof-0.21 \
rubygem-ruby-3.2.0-typeprof-0.21.3 \
rubygem-ruby-3.2.0-un \
rubygem-ruby-3.2.0-un-0 \
rubygem-ruby-3.2.0-un-0.2 \
rubygem-ruby-3.2.0-un-0.2.1 \
rubygem-ruby-3.2.0-uri \
rubygem-ruby-3.2.0-uri-0 \
rubygem-ruby-3.2.0-uri-0.12 \
rubygem-ruby-3.2.0-uri-0.12.1 \
rubygem-ruby-3.2.0-weakref \
rubygem-ruby-3.2.0-weakref-0 \
rubygem-ruby-3.2.0-weakref-0.1 \
rubygem-ruby-3.2.0-weakref-0.1.2 \
rubygem-ruby-3.2.0-yaml \
rubygem-ruby-3.2.0-yaml-0 \
rubygem-ruby-3.2.0-yaml-0.2 \
rubygem-ruby-3.2.0-yaml-0.2.1 \
rubygem-ruby-3.2.0-zlib \
rubygem-ruby-3.2.0-zlib-3 \
rubygem-ruby-3.2.0-zlib-3.0 \
rubygem-ruby-3.2.0-zlib-3.0.0 \
rubygem-ruby2-keywords \
rubygem-securerandom \
rubygem-set \
rubygem-shellwords \
rubygem-singleton \
rubygem-stringio \
rubygem-strscan \
rubygem-syntax-suggest \
rubygem-syslog \
rubygem-tempfile \
rubygem-test-unit \
rubygem-time \
rubygem-timeout \
rubygem-tmpdir \
rubygem-tsort \
rubygem-typeprof \
rubygem-un \
rubygem-uri \
rubygem-weakref \
rubygem-yaml \
rubygem-zlib"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libncurses.so.6 \
libreadline.so.8 \
libruby3-2-3-2 \
libruby3.2.so.3.2 \
libssl.so.3 \
libyaml-0.so.2 \
libz.so.1 \
ruby-common \
update-alternatives"

inherit rpm
