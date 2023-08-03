SUMMARY = "Emoji for Python"
DESCRIPTION = "This Python module provides unicode emoji output for strings containing emoji codes. \
In addition to the official list defined by the unicode consortium a whole bunch of aliases is defined. \
 \
Example: \
>> import emoji \
>> print(emoji.emojize('Python is :thumbs_up:')) \
Python is 👍 \
>> print(emoji.emojize('Python is :thumbsup:', use_aliases=True)) \
Python is 👍 \
 \
By default, the language is English (``language='en'``). Further supported langauges are: \
* Spanish ('es') \
* Portuguese ('pt') \
* Italian ('it') \
* French ('fr') \
* German ('de') \
* Farsi/Persian ('fa') \
* Indonesian ('id') \
* Simplified Chinese ('zh') \
* Japanese ('ja') \
* Korean ('ko')"
LICENSE = "BSD-3-Clause"

PV = "2.7.0"

RPM_NAME = "python311-emoji-2.7.0-1.1.noarch.rpm"
RPM_HASH = "621c6b52904985ca570ffc6f81858d7b16deb8ddc0706f91f2b56565a6c1a77231f56d42e2f76c9bf97841e8a02372295c4becd2a5b55fc65dc9a2bedf2b9c89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-emoji \
python3.11dist-emoji \
python311-emoji \
python3dist-emoji"

RDEPENDS:${PN} += "python-abi"

inherit rpm
